package work.sendfun.knock.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measuredatas")
public class Measuredatas {
    @Id
    private  Integer id;

    private String name;

    private Integer power1;

    private Integer power2;

    private Integer power3;

    private Integer power4;

    private Integer power5;

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getPower1(){
        return power1;
    }

    public Integer getPower2(){
        return power2;
    }

    public Integer getPower3(){
        return power3;
    }

    public Integer getPower4(){
        return power4;
    }

    public Integer getPower5(){
        return  power5;
    }
}
