package pl.s23319.nbp.application;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NbpEntity {
    NbpEntity(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String waluta;
    private String startDate;
    private String endDate;
    private String code;

    NbpEntity(String code,String waluta,  String startDate, String endDate){
        this.waluta=waluta;
        this.code=code;
        this.startDate=startDate;
        this.endDate=endDate;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
