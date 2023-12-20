package java8.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Nikita","Mungane",2500,List.of("Project 1" , "Project 2")));
		employees.add(new Employee("Aditya","Mungane",3000,List.of("Project 3" , "Project 4")));
		employees.add(new Employee("Riya","Sharma",3500,List.of("Project 5" , "Project 6")));
		employees.add(new Employee("Akash","Mishra",4500,List.of("Project 7" , "Project 8")));
		
		 //foreach
	    employees.stream().forEach(emp -> System.out.println(emp));
		//map
	   List<Employee> incSal=employees.stream()
	    .map(emp -> new Employee(
	    		emp.getFName(),emp.getLName(),
	    		emp.getSalary()*2,emp.getProjects()
	    		)).collect(Collectors.toList());
       System.out.println(incSal);
       
       //filter
       employees.stream().filter(em -> em.getSalary()>3000).forEach(emp -> System.out.println(emp));
       Employee e=employees.stream().filter(em -> em.getSalary()>5000).findFirst().orElse(null);
       System.out.println(e);
       //count
       long n = employees.stream().filter(f->f.getSalary()>3000).count();
       System.out.println(n);
       
       //flatmap
       String projects= employees.stream().map(emp->emp.getProjects()).flatMap(strings -> strings.stream())
       .collect(Collectors.joining(","));
      
       System.out.println(projects);
      //short circuit operation
       
       List<Employee> shortCircuit=employees.stream().skip(2).limit(2).collect(Collectors.toList());
       System.out.println(shortCircuit);
       //Finite Data
       Stream.generate(Math::random).limit(5).forEach(v -> System.out.println(v));
       //sorting
       
       List<Employee> sortedemp=employees.stream().sorted((o1,o2)->o1.getFName().compareTo(o2.getFName())).collect(Collectors.toList());
       System.out.println(sortedemp);
       List<Employee> reverssort=employees.stream().sorted((o1,o2)->-o1.getFName().compareTo(o2.getFName())).collect(Collectors.toList());
       System.out.println(reverssort);
       //sort according to length of name
       Comparator<Employee> c= (s1,s2)->{
    	   int l1=s1.getFName().length();
    	   int l2= s2.getFName().length();
    	   if(l1>l2) return +1;
    	   else if(l1<l2) return -1;
    	   else return s1.getFName().compareTo(s2.getFName());
       };
       List<Employee> sortem=employees.stream().sorted(c).collect(Collectors.toList());
       System.out.println(sortem);
       //min or max
       
       Employee max= employees.stream().max((a1,a2)-> a1.getFName().compareTo(a2.getFName())).get();
       System.out.println(max);
       Employee min= employees.stream().min((a1,a2)-> a1.getFName().compareTo(a2.getFName())).get();
       System.out.println(min);
       Employee d=employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
       System.out.println(d);
       //reduce
      double dob= employees.stream().map(emp-> emp.getSalary()).reduce(0.0,Double::sum);
      System.out.println(dob);
}
}
