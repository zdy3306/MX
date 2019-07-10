package com.mx.mapper.enity;

public class Paper {
    private long paperId;
    private String paperName;
    private int paperNum;
    private String paperDetail;

    public long getPaperId() {
        return paperId;
    }

    public void setPaperId(long paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }

    public String getPaperDetail() {
        return paperDetail;
    }

    public void setPaperDetail(String paperDetail) {
        this.paperDetail = paperDetail;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Paper{");
        sb.append("paperId=").append(paperId);
        sb.append(", paperName='").append(paperName).append('\'');
        sb.append(", paperNum=").append(paperNum);
        sb.append(", paperDetail='").append(paperDetail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}