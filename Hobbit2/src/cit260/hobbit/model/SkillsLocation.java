/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

import java.util.Objects;

/**
 *
 * @author Sir Guthrie el Nobel
 */
public class SkillsLocation implements Serializable{
    private String MathQuestion;
    private Boolean Requirements;
    private Float ExperiencePoints;

    public SkillsLocation() {
    }

    
    
    public String getMathQuestion() {
        return MathQuestion;
    }

    public void setMathQuestion(String MathQuestion) {
        this.MathQuestion = MathQuestion;
    }

    public Boolean getRequirements() {
        return Requirements;
    }

    public void setRequirements(Boolean Requirements) {
        this.Requirements = Requirements;
    }

    public Float getExperiencePoints() {
        return ExperiencePoints;
    }

    public void setExperiencePoints(Float ExperiencePoints) {
        this.ExperiencePoints = ExperiencePoints;
    }

    @Override
    public String toString() {
        return "SkillsLocation{" + "MathQuestion=" + MathQuestion + ", Requirements=" + Requirements + ", ExperiencePoints=" + ExperiencePoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.MathQuestion);
        hash = 47 * hash + Objects.hashCode(this.Requirements);
        hash = 47 * hash + Objects.hashCode(this.ExperiencePoints);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SkillsLocation other = (SkillsLocation) obj;
        if (!Objects.equals(this.MathQuestion, other.MathQuestion)) {
            return false;
        }
        if (!Objects.equals(this.Requirements, other.Requirements)) {
            return false;
        }
        if (!Objects.equals(this.ExperiencePoints, other.ExperiencePoints)) {
            return false;
        }
        return true;
    }
    
    
}
