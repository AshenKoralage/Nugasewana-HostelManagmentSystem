/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Ashen Koralage
 */
public class LoginDTO {
    private String UserName;
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String UserName, String password) {
        this.UserName = UserName;
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
