package com.pb.moskalik.hw8;

import java.util.Scanner;

public class Auth {
     private String login;
    private String password;



    public void signUp(String userLogin,String userPassword,String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (userLogin.matches("^[a-zA-Z0-9]{5,20}$")) {
            this.login = userLogin;
        } else throw new WrongLoginException("длина логина должна быть от 5 до 20 символов,только латинские буквы и цифры");

        if (userPassword.matches("^[a-zA-Z0-9]{5,}(\\_)$"));
        else throw new WrongPasswordException("длина пароля должна быть более 5, только латинские буквы и цифры и знак подчеркивания");

        if (userPassword.equals(confirmPassword) ) {this.password = userPassword;}
            else throw new WrongPasswordException("введенные пароли разные");
        System.out.println("регистрация на сайте успешная");
    }

    public void signIn (String userLogin2,String userPassword2) throws WrongLoginException{

        if(userLogin2.equals(this.login) && userPassword2.equals(this.password)){System.out.println("вход успешный");}
        else throw new WrongLoginException("пользователь не найден, зарегистрируйтесь");

    }
}
