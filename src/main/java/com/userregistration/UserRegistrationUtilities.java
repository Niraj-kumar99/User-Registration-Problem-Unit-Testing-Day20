package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUtilities {

    public boolean validName(String name)
    {
        String name_regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(name_regex);

        if (name.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean validEmail(String mail) {
        String mail_regex = "^([a-zA-z0-9-_+\\.]+)@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
        Pattern pattern = Pattern.compile(mail_regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    public boolean validMobileNumber(String mobileNumber) {
        String mobileNumber_regex = "^(91)[0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumber_regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean validPassword(String password) {
        String password_regex = ("^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public void getAnd_Validate_UserDetails() {
        Scanner sc = new Scanner(System.in);
        UserRegistrationUtilities registrationUtilities = new UserRegistrationUtilities();
        GetandSetUserDetails getandSetUserDetails = new GetandSetUserDetails();

        // Get and validate User First Name .
        System.out.println("Enter First Name");
        getandSetUserDetails.setFirst_name(sc.next());
        boolean fname = registrationUtilities.validName(getandSetUserDetails.getFirst_name());
        if (fname)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");

        // Get and validate Last Name .
        System.out.println("Enter Last Name");
        getandSetUserDetails.setLast_name(sc.next());
        boolean lname = registrationUtilities.validName(getandSetUserDetails.getLast_name());
        if (lname)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");

        // Get and validate User Mail .
        System.out.println("Enter Email");
        getandSetUserDetails.setMail(sc.next());
        boolean mail = registrationUtilities.validEmail(getandSetUserDetails.getMail());
        if (mail)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

        //Get and validate User Mobile Number .
        System.out.println("Enter Mobile Number");
        getandSetUserDetails.setMobile_number(sc.next());
        boolean mobNumber = registrationUtilities.validMobileNumber(getandSetUserDetails.getMobile_number());
        if (mobNumber)
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");

        // Get and validate User Password .
        System.out.println("Enter Password");
        getandSetUserDetails.setPassword(sc.next());
        boolean pass = registrationUtilities.validPassword(getandSetUserDetails.getPassword());
        if (pass)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
