package info.jkjensen.familymap.Model;

import java.util.ArrayList;

/**
 * Created by Jk on 3/16/2016.
 */
public class FamilyMap {
    private static FamilyMap instance = null;

    public boolean mIsUserLoggedIn = false;

    private ArrayList<Event> mUserEvents;

    private String mAuthToken;
    private String mUsername;
    private String mUserId;
    private String mUserFirstName;
    private String mUserLastName;
    private String mUserGender;

    public static FamilyMap getInstance() {
        if(instance == null){
            instance = new FamilyMap();
        }
        return instance;
    }

    private FamilyMap() {
    }

    public String getAuthToken() {
        return mAuthToken;
    }

    public void setAuthToken(String authToken) {
        mAuthToken = authToken;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public void setUserFirstName(String userFirstName) {
        mUserFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        mUserLastName = userLastName;
    }

    public void setUserGender(String userGender) {
        mUserGender = userGender;
    }

    public String getFullName(){
        return mUserFirstName + " " + mUserLastName;
    }

    public ArrayList<Event> getUserEvents() {
        return mUserEvents;
    }

    public void setUserEvents(ArrayList<Event> userEvents) {
        mUserEvents = userEvents;
    }
}
