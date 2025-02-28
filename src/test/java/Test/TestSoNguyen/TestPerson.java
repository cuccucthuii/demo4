package Test.TestSoNguyen;

import com.example.Test4.Bai2.Person;
import com.example.Test4.Bai2.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPerson {
    private Person ps1, ps2;
    private PersonService service;

    @BeforeEach
    public void setUp(){
        service = new PersonService();
        ps1 = new Person("PS1","Tony",27,8.0f,11,"PTPM");
        ps2 = new Person("PS2","Joiny",43,9.0f,14,"UDPM");
        service.addPerson(ps1);
        service.addPerson(ps2);
    }

    @Test
    public void addPerson(){
        Person ps3 = new Person("PS3","CatTa",22,9.0f,14,"UDPM");
        service.addPerson(ps3);
    }

    @Test
    public void addPerson01(){
        Person ps4 = new Person("fff","CatTa",16,555,14,"fff");
        service.addPerson(ps4);
    }
}
