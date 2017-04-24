package com.zjz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * What's this about?
 *
 * @author Xiao Song(xiaosong at qiyi.com)
 * @since 2017/4/24 22:57
 */
@Entity
@Table(name="corpus")
public class Corpus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    private String name;
    private String grade;
    private String level;
    private String gender;
    private int age;
    private String country;
    private boolean ethnicChinese;
    private String studyTime;
    private String nativeLanguage;
    private String otherLanguage;
    private boolean hsk;
    private boolean hskCertificate;
    private String hskLevel;
    private String beforeLearningContext;
    private String courseResults;
    private String educationLevel;
    private String major;
    private String character;
    private String motivation;
    private String source;
    private String timestamp;
    private String genre;
    private String title;
    private String requirement;
    private String score;
    private String provider;
    private String content;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isEthnicChinese() {
        return ethnicChinese;
    }

    public void setEthnicChinese(boolean ethnicChinese) {
        this.ethnicChinese = ethnicChinese;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getOtherLanguage() {
        return otherLanguage;
    }

    public void setOtherLanguage(String otherLanguage) {
        this.otherLanguage = otherLanguage;
    }

    public boolean isHsk() {
        return hsk;
    }

    public void setHsk(boolean hsk) {
        this.hsk = hsk;
    }

    public boolean isHskCertificate() {
        return hskCertificate;
    }

    public void setHskCertificate(boolean hskCertificate) {
        this.hskCertificate = hskCertificate;
    }

    public String getHskLevel() {
        return hskLevel;
    }

    public void setHskLevel(String hskLevel) {
        this.hskLevel = hskLevel;
    }

    public String getBeforeLearningContext() {
        return beforeLearningContext;
    }

    public void setBeforeLearningContext(String beforeLearningContext) {
        this.beforeLearningContext = beforeLearningContext;
    }

    public String getCourseResults() {
        return courseResults;
    }

    public void setCourseResults(String courseResults) {
        this.courseResults = courseResults;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
