/*
 * The MIT License
 *
 * Copyright 2020 buddhika.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lk.gov.health.phsp.pojcs;

import java.util.Date;
import lk.gov.health.phsp.bean.CommonController;
import lk.gov.health.phsp.entity.Component;

/**
 *
 * @author buddhika
 */
public class EncounterBasicData {

    private String phn;
    private String gnArea;
    private String institution;
    private String phone;
    private String name;
    private String address;
    private Date dataOfBirth;
    private Date encounterAt;
    private String sex;
    private int ageInYears;
    private String componentName;
    private Boolean completed;

    public EncounterBasicData() {
    }

    public EncounterBasicData(String phn, String gnArea, String institution, Date dataOfBirth, Date encounterAt, String sex) {
        this.phn = phn;
        this.gnArea = gnArea;
        this.institution = institution;
        this.dataOfBirth = dataOfBirth;
        this.encounterAt = encounterAt;
        this.sex = sex;
    }

    public EncounterBasicData(String phn, String gnArea, String institution, Date dataOfBirth, Date encounterAt, String sex, String componentName) {
        this.phn = phn;
        this.gnArea = gnArea;
        this.institution = institution;
        this.dataOfBirth = dataOfBirth;
        this.encounterAt = encounterAt;
        this.sex = sex;
        this.componentName = componentName;
    }

    public EncounterBasicData(
            String phn,
            String name,
            Date dataOfBirth,
            String sex,
            String phone,
            String address,
            String gnArea,
            String institution, 
            Date encounterAt) {
        this.phn = phn;
        this.name=name;
        this.dataOfBirth = dataOfBirth;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.gnArea = gnArea;
        this.institution = institution;       
        this.encounterAt = encounterAt;
    }
    
    public EncounterBasicData(
            String phn,
            String name,
            Date dataOfBirth,
            String sex,
            String phone,
            String address,
            String gnArea,
            String institution, 
            Date encounterAt,
            Boolean completed) {
        this.phn = phn;
        this.name=name;
        this.dataOfBirth = dataOfBirth;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.gnArea = gnArea;
        this.institution = institution;       
        this.encounterAt = encounterAt;
        this.completed = completed;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getGnArea() {
        return gnArea;
    }

    public void setGnArea(String gnArea) {
        this.gnArea = gnArea;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Date getEncounterAt() {
        return encounterAt;
    }

    public void setEncounterAt(Date encounterAt) {
        this.encounterAt = encounterAt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAgeInYears() {
        ageInYears = CommonController.differenceInYears(dataOfBirth, encounterAt);
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
    

}
