package day8.Services;

import java.io.BufferedReader;
import java.io.FileReader;

public class Account {
    private String username, password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean check(Account acc) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/day8/Services/users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    if (parts[0].equals(acc.username) && parts[1].equals(acc.password)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading file error.");
        }
        return false;
    }

}
