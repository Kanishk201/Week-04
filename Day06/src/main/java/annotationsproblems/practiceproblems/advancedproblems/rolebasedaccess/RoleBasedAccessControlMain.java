package annotationsproblems.practiceproblems.advancedproblems.rolebasedaccess;

public class RoleBasedAccessControlMain {
    public static void main(String[] args) {
        User adminUser = new User("ADMIN");
        User regularUser = new User("USER");

        AdminPanel adminPanel = new AdminPanel();

        // Admin should be able to delete users
        System.out.println("Admin trying to delete user:");
        RoleBasedAccessControl.invokeMethod(adminPanel, "deleteUser", adminUser);

        // Regular user should be denied access to deleteUser
        System.out.println("\nRegular user trying to delete user:");
        RoleBasedAccessControl.invokeMethod(adminPanel, "deleteUser", regularUser);

        // Regular user should be able to view dashboard
        System.out.println("\nRegular user trying to view dashboard:");
        RoleBasedAccessControl.invokeMethod(adminPanel, "viewDashboard", regularUser);
    }
}
