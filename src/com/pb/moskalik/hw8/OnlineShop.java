package com.pb.moskalik.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args){
        Auth auth=new Auth();

        System.out.println("Зарегистрируйтесь на сайте, придумайте логин и пароль и повторите пароль");

        Scanner scan=new Scanner(System.in);
        String userLogin=scan.next();
        String userPassword=scan.next();
        String confirmPassword=scan.next();

    try{
    auth.signUp(userLogin,userPassword,confirmPassword);
        System.out.println("Войдите на сайт, введите логин и пароль");

        String userLogin2=scan.next();
        String userPassword2=scan.next();

        try{
            auth.signIn(userLogin2,userPassword2);
        } catch (WrongLoginException e){
            e.printStackTrace();
        }
    } catch (WrongLoginException e){
    e.printStackTrace();
    }catch (WrongPasswordException e){
    e.printStackTrace();
    }

    }
}
