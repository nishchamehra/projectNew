/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author nishc
 */
public class SubjectDto {
int subjectId ;
String subjectName ; 
String subjectFaculty;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectFaculty() {
        return subjectFaculty;
    }

    public void setSubjectFaculty(String subjectFaculty) {
        this.subjectFaculty = subjectFaculty;
    }


}
