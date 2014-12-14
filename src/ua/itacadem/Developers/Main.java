package ua.itacadem.Developers;


public class Main {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7)
        };
        StringBuilder sb;

        for (Developer d : list) {
            sb = new StringBuilder() // !!!
                    .append(d.department)
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }
            HR[] hr = {new HR("Ira", 250, 2)};
            for (HR n : hr) {
                sb = new StringBuilder() // !!!
                        .append(n.department)
                        .append(n.getName())
                        .append(": ")
                        .append(n.getBasicSalary())
                        .append(" -> ")
                        .append(n.getSalary());
                System.out.println(sb.toString());
            }
        }
    }

