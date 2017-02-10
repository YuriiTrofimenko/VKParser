/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.vkparser.model;

/**
 *
 * @author Юрий
 */
public class VKUser
{
    private String mInterests;
    private String mActivities;
    private String mAbout;
    
    private Integer mPolitical;
    private String mReligion;
    private String mInspiredBy;
    private Integer mPeopleMain;
    private Integer mLifeMain;
    private Integer mSmoking;
    private Integer mAlcohol;
    
    public VKUser(){
    
        mInterests = "";
        mActivities = "";
        mAbout = "";
        
        mPolitical = 0;
        mReligion = "";
        mInspiredBy = "";
        mLifeMain = 0;
        mSmoking = 0;
        mAlcohol = 0;
    }

    public String getInterests()
    {
        return mInterests;
    }

    public void setInterests(String _interests)
    {
        this.mInterests = _interests;
    }

    public String getActivities()
    {
        return mActivities;
    }

    public void setActivities(String _activities)
    {
        this.mActivities = _activities;
    }

    public String getAbout()
    {
        return mAbout;
    }

    public void setAbout(String _about)
    {
        this.mAbout = _about;
    }

    public Integer getPolitical()
    {
        return mPolitical;
    }

    public void setPolitical(Integer _political)
    {
        this.mPolitical = _political;
    }

    public String getReligion()
    {
        return mReligion;
    }

    public void setReligion(String _religion)
    {
        this.mReligion = _religion;
    }

    public String getInspiredBy()
    {
        return mInspiredBy;
    }

    public void setInspiredBy(String _inspiredBy)
    {
        this.mInspiredBy = _inspiredBy;
    }

    public Integer getPeopleMain()
    {
        return mPeopleMain;
    }

    public void setPeopleMain(Integer _peopleMain)
    {
        this.mPeopleMain = _peopleMain;
    }

    public Integer getLifeMain()
    {
        return mLifeMain;
    }

    public void setLifeMain(Integer _lifeMain)
    {
        this.mLifeMain = _lifeMain;
    }

    public Integer getSmoking()
    {
        return mSmoking;
    }

    public void setSmoking(Integer _smoking)
    {
        this.mSmoking = _smoking;
    }

    public Integer getAlcohol()
    {
        return mAlcohol;
    }

    public void setAlcohol(Integer _alcohol)
    {
        this.mAlcohol = _alcohol;
    }
}
