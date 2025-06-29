package setting_up_junit;

public class UserService {
    private int userCount = 0;

    public void registerUser(String username) {
        if (username != null && !username.isEmpty()) {
            userCount++;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public void resetUsers() {
        userCount = 0;
    }
}
