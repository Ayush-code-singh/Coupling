package org.tight.coupling;

public class TightCouplingExample {
    // entry point
    public static void main(String[] args) {
        UserManager userManager =new UserManager();
        System.out.println(userManager.getUserInfo());
    }

}
