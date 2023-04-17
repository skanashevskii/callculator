package com.example.exception;

public class Main {
    public static void main(String[] args) {
        try{
            checkAutorisation("java_skypro_go","D_1hWiKjjP_9","D_1hWiKjjP_9");
            System.out.println("Добро пожаловать!");
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Все под контролем!!!");
        }

    }


        public static boolean checkAutorisation (String login, String password, String confirmPasword)
                throws WrongLoginException, WrongPasswordException {

            if (login.length() > 20) {
                throw new WrongLoginException("Логин не верный!");
            }
            if (password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPasword)) {
                throw new WrongPasswordException("Пароль не верный!");
            }
            return true;
        }
    }

