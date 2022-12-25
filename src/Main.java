public class Main {
    public static void main(String[] args) {

    }
        private static final Employee[] employees = {
                new Employee("Аносьев Михаил Сергеевич", 1000, 1),
                new Employee("Авдеев Андрей Михайлович", 2000,2),
                new Employee("Бухарин Максим Владимирович", 3000,3),
                new Employee("Иванов Иван Иванович", 4000,1),
                new Employee("Федоров Федор Федорович", 5000,2)
        };

        public static void printEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

        public static int calculateTotalSalary() {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }

        public static Employee findEmployeeWithMinSalary() {
            Employee result = employees[0];
            int minSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }

        public static Employee findEmployeeWithMaxSalary() {
            Employee result = employees[0];
            int maxSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }

        public static float calculateAverageSalary() {
            return calculateTotalSalary() / (float) employees.length;
        }

        public static void printFullName() {
            for (Employee employee : employees) {
                System.out.println(employee.getFullName());
            }
    }

}