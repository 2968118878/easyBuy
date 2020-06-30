package cn.easybuy.entity;

import cn.easybuy.entity.Address;

import java.util.List;

public class User {
    private int id;             //用户id
    private String userName;    //用户真实姓名
    private String loginName;   //用户登录用户名
    private String password;    //密码
    private int sex;         //性别
    private String sexName;        //性别
    private String identityCode;//身份证号
    private String email;       //电子邮箱
    private String mobile;      //电话号码
    private int type;           //0为前台，1为后台

    private List<Address> addressList;  //用户的地址集合

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName() {
        if(sex==0){
            sexName = "女";
        }else{
            sexName = "男";
        }
    }
}
