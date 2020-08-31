package cn.kerninventory.mybatis.gen.mybatisplus.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.Year;
import cn.kerninventory.mybatis.gen.mybatisplus.pojo.BaseEntity;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.Blob;

/**
 * <p>
 * 
 * </p>
 *
 * @author MPG
 * @since 2020-08-31
 */
public class Test extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_bigint", type = IdType.AUTO)
    private Long cBigint;

    private String cVarchar;

    private byte[] cBinary;

    private Boolean cBit;

    private Blob cBlob;

    private String cChar;

    private LocalDate cDate;

    private LocalDateTime cDatetime;

    private BigDecimal cDecimal;

    private Double cDouble;

    private Float cFloat;

    private String cGeometry;

    private String cGeometrycollection;

    private Integer cInt;

    private Integer cInteger;

    private String cJson;

    private String cLinestring;

    private Blob cLongblob;

    private String cLongtext;

    private Blob cMediumblob;

    private Integer cMediumint;

    private String cMediumtext;

    private String cMultilinestring;

    private Integer cMultipoint;

    private String cMultipolygon;

    private BigDecimal cNumeric;

    private Integer cPoint;

    private String cPolygon;

    private Double cReal;

    private Integer cSmallint;

    private String cText;

    private LocalTime cTime;

    private LocalDateTime cTimestamp;

    private Blob cTinyblob;

    private Integer cTinyint;

    private String cTinytext;

    private byte[] cVarbinary;

    private Year cYear;


    public Long getcBigint() {
        return cBigint;
    }

    public Test setcBigint(Long cBigint) {
        this.cBigint = cBigint;
        return this;
    }

    public String getcVarchar() {
        return cVarchar;
    }

    public Test setcVarchar(String cVarchar) {
        this.cVarchar = cVarchar;
        return this;
    }

    public byte[] getcBinary() {
        return cBinary;
    }

    public Test setcBinary(byte[] cBinary) {
        this.cBinary = cBinary;
        return this;
    }

    public Boolean getcBit() {
        return cBit;
    }

    public Test setcBit(Boolean cBit) {
        this.cBit = cBit;
        return this;
    }

    public Blob getcBlob() {
        return cBlob;
    }

    public Test setcBlob(Blob cBlob) {
        this.cBlob = cBlob;
        return this;
    }

    public String getcChar() {
        return cChar;
    }

    public Test setcChar(String cChar) {
        this.cChar = cChar;
        return this;
    }

    public LocalDate getcDate() {
        return cDate;
    }

    public Test setcDate(LocalDate cDate) {
        this.cDate = cDate;
        return this;
    }

    public LocalDateTime getcDatetime() {
        return cDatetime;
    }

    public Test setcDatetime(LocalDateTime cDatetime) {
        this.cDatetime = cDatetime;
        return this;
    }

    public BigDecimal getcDecimal() {
        return cDecimal;
    }

    public Test setcDecimal(BigDecimal cDecimal) {
        this.cDecimal = cDecimal;
        return this;
    }

    public Double getcDouble() {
        return cDouble;
    }

    public Test setcDouble(Double cDouble) {
        this.cDouble = cDouble;
        return this;
    }

    public Float getcFloat() {
        return cFloat;
    }

    public Test setcFloat(Float cFloat) {
        this.cFloat = cFloat;
        return this;
    }

    public String getcGeometry() {
        return cGeometry;
    }

    public Test setcGeometry(String cGeometry) {
        this.cGeometry = cGeometry;
        return this;
    }

    public String getcGeometrycollection() {
        return cGeometrycollection;
    }

    public Test setcGeometrycollection(String cGeometrycollection) {
        this.cGeometrycollection = cGeometrycollection;
        return this;
    }

    public Integer getcInt() {
        return cInt;
    }

    public Test setcInt(Integer cInt) {
        this.cInt = cInt;
        return this;
    }

    public Integer getcInteger() {
        return cInteger;
    }

    public Test setcInteger(Integer cInteger) {
        this.cInteger = cInteger;
        return this;
    }

    public String getcJson() {
        return cJson;
    }

    public Test setcJson(String cJson) {
        this.cJson = cJson;
        return this;
    }

    public String getcLinestring() {
        return cLinestring;
    }

    public Test setcLinestring(String cLinestring) {
        this.cLinestring = cLinestring;
        return this;
    }

    public Blob getcLongblob() {
        return cLongblob;
    }

    public Test setcLongblob(Blob cLongblob) {
        this.cLongblob = cLongblob;
        return this;
    }

    public String getcLongtext() {
        return cLongtext;
    }

    public Test setcLongtext(String cLongtext) {
        this.cLongtext = cLongtext;
        return this;
    }

    public Blob getcMediumblob() {
        return cMediumblob;
    }

    public Test setcMediumblob(Blob cMediumblob) {
        this.cMediumblob = cMediumblob;
        return this;
    }

    public Integer getcMediumint() {
        return cMediumint;
    }

    public Test setcMediumint(Integer cMediumint) {
        this.cMediumint = cMediumint;
        return this;
    }

    public String getcMediumtext() {
        return cMediumtext;
    }

    public Test setcMediumtext(String cMediumtext) {
        this.cMediumtext = cMediumtext;
        return this;
    }

    public String getcMultilinestring() {
        return cMultilinestring;
    }

    public Test setcMultilinestring(String cMultilinestring) {
        this.cMultilinestring = cMultilinestring;
        return this;
    }

    public Integer getcMultipoint() {
        return cMultipoint;
    }

    public Test setcMultipoint(Integer cMultipoint) {
        this.cMultipoint = cMultipoint;
        return this;
    }

    public String getcMultipolygon() {
        return cMultipolygon;
    }

    public Test setcMultipolygon(String cMultipolygon) {
        this.cMultipolygon = cMultipolygon;
        return this;
    }

    public BigDecimal getcNumeric() {
        return cNumeric;
    }

    public Test setcNumeric(BigDecimal cNumeric) {
        this.cNumeric = cNumeric;
        return this;
    }

    public Integer getcPoint() {
        return cPoint;
    }

    public Test setcPoint(Integer cPoint) {
        this.cPoint = cPoint;
        return this;
    }

    public String getcPolygon() {
        return cPolygon;
    }

    public Test setcPolygon(String cPolygon) {
        this.cPolygon = cPolygon;
        return this;
    }

    public Double getcReal() {
        return cReal;
    }

    public Test setcReal(Double cReal) {
        this.cReal = cReal;
        return this;
    }

    public Integer getcSmallint() {
        return cSmallint;
    }

    public Test setcSmallint(Integer cSmallint) {
        this.cSmallint = cSmallint;
        return this;
    }

    public String getcText() {
        return cText;
    }

    public Test setcText(String cText) {
        this.cText = cText;
        return this;
    }

    public LocalTime getcTime() {
        return cTime;
    }

    public Test setcTime(LocalTime cTime) {
        this.cTime = cTime;
        return this;
    }

    public LocalDateTime getcTimestamp() {
        return cTimestamp;
    }

    public Test setcTimestamp(LocalDateTime cTimestamp) {
        this.cTimestamp = cTimestamp;
        return this;
    }

    public Blob getcTinyblob() {
        return cTinyblob;
    }

    public Test setcTinyblob(Blob cTinyblob) {
        this.cTinyblob = cTinyblob;
        return this;
    }

    public Integer getcTinyint() {
        return cTinyint;
    }

    public Test setcTinyint(Integer cTinyint) {
        this.cTinyint = cTinyint;
        return this;
    }

    public String getcTinytext() {
        return cTinytext;
    }

    public Test setcTinytext(String cTinytext) {
        this.cTinytext = cTinytext;
        return this;
    }

    public byte[] getcVarbinary() {
        return cVarbinary;
    }

    public Test setcVarbinary(byte[] cVarbinary) {
        this.cVarbinary = cVarbinary;
        return this;
    }

    public Year getcYear() {
        return cYear;
    }

    public Test setcYear(Year cYear) {
        this.cYear = cYear;
        return this;
    }

    @Override
    public String toString() {
        return "Test{" +
        "cBigint=" + cBigint +
        ", cVarchar=" + cVarchar +
        ", cBinary=" + cBinary +
        ", cBit=" + cBit +
        ", cBlob=" + cBlob +
        ", cChar=" + cChar +
        ", cDate=" + cDate +
        ", cDatetime=" + cDatetime +
        ", cDecimal=" + cDecimal +
        ", cDouble=" + cDouble +
        ", cFloat=" + cFloat +
        ", cGeometry=" + cGeometry +
        ", cGeometrycollection=" + cGeometrycollection +
        ", cInt=" + cInt +
        ", cInteger=" + cInteger +
        ", cJson=" + cJson +
        ", cLinestring=" + cLinestring +
        ", cLongblob=" + cLongblob +
        ", cLongtext=" + cLongtext +
        ", cMediumblob=" + cMediumblob +
        ", cMediumint=" + cMediumint +
        ", cMediumtext=" + cMediumtext +
        ", cMultilinestring=" + cMultilinestring +
        ", cMultipoint=" + cMultipoint +
        ", cMultipolygon=" + cMultipolygon +
        ", cNumeric=" + cNumeric +
        ", cPoint=" + cPoint +
        ", cPolygon=" + cPolygon +
        ", cReal=" + cReal +
        ", cSmallint=" + cSmallint +
        ", cText=" + cText +
        ", cTime=" + cTime +
        ", cTimestamp=" + cTimestamp +
        ", cTinyblob=" + cTinyblob +
        ", cTinyint=" + cTinyint +
        ", cTinytext=" + cTinytext +
        ", cVarbinary=" + cVarbinary +
        ", cYear=" + cYear +
        "}";
    }
}
