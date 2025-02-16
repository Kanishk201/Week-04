package annotationsproblems.practiceproblems.advancedproblems.rolebasedaccess;

import java.lang.reflect.Method;

public class RoleBasedAccessControl {
    public static void invokeMethod(Object object, String methodName, User user) {
        try {
            Method method = object.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();

                if (!user.getRole().equals(requiredRole)) {
                    System.out.println("Access Denied! " + user.getRole() + " cannot access " + methodName);
                    return;
                }
            }

            method.invoke(object);  // Execute the method if access is granted

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
