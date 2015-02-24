package com.numhero.server.service;

import com.numhero.server.NumheroUtils;
import com.numhero.server.auth.OneWayEncryptionService;
import com.numhero.server.model.dao.SessionDao;
import com.numhero.server.model.dao.UserDao;
import com.numhero.server.model.pojo.Session;
import com.numhero.server.model.pojo.User;
import com.numhero.server.utils.XmlResponseParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class RestCreateNewSession {

	private UserDao userDao;
	private SessionDao sessionDao;
	private OneWayEncryptionService oneWayEncryption;


	public RestCreateNewSession() {
		userDao = NumheroUtils.injector.getInstance(UserDao.class);
		sessionDao = NumheroUtils.injector.getInstance(SessionDao.class);
		oneWayEncryption = NumheroUtils.injector.getInstance(OneWayEncryptionService.class);
	}

	private static Log log = LogFactory.getLog(RestCreateNewSession.class);

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String userId = request.getParameter("userId");
		String userVersion = request.getParameter("userVersion");
		String hash = request.getParameter("hash");
		String requestId = request.getParameter("requestId");
		log.debug("userId " + userId);
		log.debug("userVersion " + userVersion);
		log.debug("hash " + hash);
		log.debug("requestId " + requestId);

		if (userId != null && userVersion != null && hash != null && requestId != null) {

			response.setContentType("text/xml");

			User u = askForUserIfNecessary(userId, userVersion, requestId);
			if (u != null) {
				if (!isValidHash(u, requestId, hash)) {
					log.info("hash is not valid Calling IP:" + request.getRemoteAddr());

					response.sendError(403, "Provided hash is not valid. This request is traced.");
				} else {
					String sid = NumheroUtils.createRandomSessionId();
					log.info("creating sessionId " + sid);
					saveSession(sid, u);

//                    PrintWriter out = response.getWriter();
//                    out.println("<sessionId>" + sid + "</sessionId>");
//                    out.close();
					String newUrl = "/company/" + u.getBusinessAccountId() + "#dashboard";
					//response.sendRedirect(newUrl);

					response.sendRedirect(response.encodeRedirectURL(newUrl));
				}
			} else {
				log.info("user not existing on the portal");
				response.sendError(400);
			}

		} else {
			log.info("not all parameters are present! userId:" + userId + " userVersion:" + userVersion + " hash:" + hash + " requestId:" + requestId);
			response.sendError(400);
		}
	}


	private boolean isValidHash(User u, String requestId, String hash) {
        String correctHash = createSaltedHash(u, requestId);
        boolean ret = correctHash.equals(hash);
        if (!ret && log.isDebugEnabled()){

            log.debug("calculated hash:" + correctHash + " user hash:" + hash);
        }
        return ret;

	}

    public String createSaltedHash(User u, String requestId) {
        String salt = "NetNumeroIsBeautifullySimple";
        String s = u.getPortalUserId() + requestId + u.getEmail() + salt;
        String correctHash = oneWayEncryption.hexMD5(s);

        log.debug("created correct hash " + correctHash + " for " + s);
        return correctHash;
    }

    private void saveSession(String sid, User user) {

		Session session = new Session(user.getId(), sid);
		sessionDao.save(session);
	}

	private User askForUserIfNecessary(String userId, String userVersion, String requestId) {

		UserDao userDao = NumheroUtils.injector.getInstance(UserDao.class);

		log.debug("askForUserIfNecessary " + userId);
		User user = userDao.findByPortalUserId(userId);
		if (user == null || !userVersion.equals(user.getVersion())) {
			// String xml = getXmlFromUrl(url);
			user = saveUserFromUrl(userId, requestId);
		}
		return user;

	}

	private User saveUserFromUrl(String pUId, String requestId) {
		// TODO move the url to config file
		String urlString = "https://www.netnumero.com/catalog/category/getUserData?userId=" + pUId + "&requestId=" + requestId;

		//prepare user
		User u;

		log.debug("askingForUser " + pUId + " to the url " + urlString);
		URL url = null;
		try {
			url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");
			connection.setReadTimeout(5000);
			connection.setConnectTimeout(2000);

			InputStream is = null;
			try {
				is = connection.getInputStream();
			} catch (IOException e) {
				log.warn("error in fetching the url " + urlString);
				e.printStackTrace();
				return null;

			}
			try {
				int responseCode = connection.getResponseCode();
				if (responseCode == 200) {
					u = getOrCreateUserFromPUId(pUId);
					XmlResponseParser.parseGetUserData(is, u);
				} else {
					log.info("resp " + responseCode + " from " + urlString);
					return null;
				}

			} finally {
				is.close();
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}


		log.debug("saving new version of User " + u.toString());
		userDao.save(u);

		return u;

	}

	private User getOrCreateUserFromPUId(String userId) {
		User u;
		u = userDao.findByPortalUserId(userId);
		if (u == null) {
			u = new User();
			u.setPortalUserId(userId);
		}
		return u;
	}

}
