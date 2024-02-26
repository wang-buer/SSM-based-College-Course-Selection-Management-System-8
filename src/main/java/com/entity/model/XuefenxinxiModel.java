package com.entity.model;

import com.entity.XuefenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学分信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-09 10:44:26
 */
public class XuefenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程类型
	 */
	
	private String kechengleixing;
		
	/**
	 * 学年
	 */
	
	private String xuenian;
		
	/**
	 * 学期
	 */
	
	private String xueqi;
		
	/**
	 * 填空题
	 */
	
	private Float tiankongti;
		
	/**
	 * 判断题
	 */
	
	private Float panduanti;
		
	/**
	 * 单选题
	 */
	
	private Float danxuanti;
		
	/**
	 * 多选题
	 */
	
	private Float duoxuanti;
		
	/**
	 * 主观题
	 */
	
	private Float zhuguanti;
		
	/**
	 * 学分
	 */
	
	private Float xuefen;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 登记时间
	 */
	
	private String dengjishijian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
				
	
	/**
	 * 设置：课程类型
	 */
	 
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
				
	
	/**
	 * 设置：学年
	 */
	 
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
	}
				
	
	/**
	 * 设置：学期
	 */
	 
	public void setXueqi(String xueqi) {
		this.xueqi = xueqi;
	}
	
	/**
	 * 获取：学期
	 */
	public String getXueqi() {
		return xueqi;
	}
				
	
	/**
	 * 设置：填空题
	 */
	 
	public void setTiankongti(Float tiankongti) {
		this.tiankongti = tiankongti;
	}
	
	/**
	 * 获取：填空题
	 */
	public Float getTiankongti() {
		return tiankongti;
	}
				
	
	/**
	 * 设置：判断题
	 */
	 
	public void setPanduanti(Float panduanti) {
		this.panduanti = panduanti;
	}
	
	/**
	 * 获取：判断题
	 */
	public Float getPanduanti() {
		return panduanti;
	}
				
	
	/**
	 * 设置：单选题
	 */
	 
	public void setDanxuanti(Float danxuanti) {
		this.danxuanti = danxuanti;
	}
	
	/**
	 * 获取：单选题
	 */
	public Float getDanxuanti() {
		return danxuanti;
	}
				
	
	/**
	 * 设置：多选题
	 */
	 
	public void setDuoxuanti(Float duoxuanti) {
		this.duoxuanti = duoxuanti;
	}
	
	/**
	 * 获取：多选题
	 */
	public Float getDuoxuanti() {
		return duoxuanti;
	}
				
	
	/**
	 * 设置：主观题
	 */
	 
	public void setZhuguanti(Float zhuguanti) {
		this.zhuguanti = zhuguanti;
	}
	
	/**
	 * 获取：主观题
	 */
	public Float getZhuguanti() {
		return zhuguanti;
	}
				
	
	/**
	 * 设置：学分
	 */
	 
	public void setXuefen(Float xuefen) {
		this.xuefen = xuefen;
	}
	
	/**
	 * 获取：学分
	 */
	public Float getXuefen() {
		return xuefen;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(String dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public String getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
			
}
