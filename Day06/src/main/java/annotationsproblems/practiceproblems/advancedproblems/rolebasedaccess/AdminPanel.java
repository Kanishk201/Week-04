package annotationsproblems.practiceproblems.advancedproblems.rolebasedaccess;

class AdminPanel {

    @RoleAllowed("ADMIN")  // Only ADMINs can access this
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    @RoleAllowed("USER")  // Regular users can access this
    public void viewDashboard() {
        System.out.println("Displaying user dashboard.");
    }
}
