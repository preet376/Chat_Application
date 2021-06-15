package com.chatapp.pritesh.Activities;

public class Users {

        String profileImage,userName,passWord,lastMsg,eMail,uID;

        public Users(String profileImage, String userName, String passWord, String lastMsg, String eMail,String uID) {
            this.profileImage = profileImage;
            this.userName = userName;
            this.passWord = passWord;
            this.lastMsg = lastMsg;
            this.eMail = eMail;
            this.uID = uID;
        }

        public Users() {
        }

        public Users(String userName, String passWord, String eMail) {
            this.userName = userName;
            this.passWord = passWord;
            this.eMail = eMail;

        }
//
//    public Users(String profileImage)
//    {
//        this.profileImage = profileImage;
//    }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getLastMsg() {
            return lastMsg;
        }

        public void setLastMsg(String lastMsg) {
            this.lastMsg = lastMsg;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public String getuID() {
            return uID;
        }

        public void setuID(String uID) {
            this.uID = uID;
        }


}
