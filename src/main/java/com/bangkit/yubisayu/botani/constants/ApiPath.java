package com.bangkit.yubisayu.botani.constants;

public class ApiPath {

    public static final String API_PATH = "/api";

    /**
     * Users API Path
     */
    public static final String USER = API_PATH + "/user";
    public static final String USERS = API_PATH + "/users";
    public static final String USERS_ID = USERS + "/{id}";
    public static final String USER_SIGN_IN = USER + "/_sign-in";
    public static final String USER_SIGN_OUT = USER + "/_sign-out";
    public static final String USER_SIGN_UP = USER + "/_sign-up";
    public static final String USER_REFRESH_TOKEN = USER + "/_refresh-token";

    /**
     * Image API Path
     */
    public static final String UPLOAD_IMAGE_FILE_PATH = API_PATH + "/upload/{filePath}";
}
