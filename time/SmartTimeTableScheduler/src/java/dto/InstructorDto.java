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
public class InstructorDto {
 int instructorId;
 String instructorName , teachingHours;

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(String teachingHours) {
        this.teachingHours = teachingHours;
    }
 
 
}
