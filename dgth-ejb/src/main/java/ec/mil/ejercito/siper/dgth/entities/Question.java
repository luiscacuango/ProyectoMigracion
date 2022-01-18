package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the QUESTION database table.
 * 
 */
@Entity
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QUESTION_ID")
	private long questionId;

	@Column(name="ANSWER_TEXT")
	private String answerText;

	@Column(name="QUESTION_TEXT")
	private String questionText;

	@Column(name="STATUS_CODE")
	private String statusCode;

	@Temporal(TemporalType.DATE)
	@Column(name="SUBMIT_DT")
	private Date submitDt;

	public Question() {
	}

	public long getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerText() {
		return this.answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getSubmitDt() {
		return this.submitDt;
	}

	public void setSubmitDt(Date submitDt) {
		this.submitDt = submitDt;
	}

}