package com.consistentlearners.ipldashboard.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "match")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "playerOfMatch")
	private String playerOfMatch;
	
	@Column(name = "venue")
	private String venue;
	
	@Column(name = "team1")
	private String team1;
	
	@Column(name = "team2")
	private String team2;
	
	@Column(name = "tossWinner")
	private String tossWinner;
	
	@Column(name = "tossDecision")
	private String tossDecision;
	
	@Column(name = "matchWinner")
	private String matchWinner;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "resultMargin")
	private String resultMargin;
	
	@Column(name = "umpire1")
	private String umpire1;
	
	@Column(name = "umpire2")
	private String umpire2;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getPlayerOfMatch() {
		return playerOfMatch;
	}
	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTossWinner() {
		return tossWinner;
	}
	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}
	public String getTossDecision() {
		return tossDecision;
	}
	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}
	public String getMatchWinner() {
		return matchWinner;
	}
	public void setMatchWinner(String matchWinner) {
		this.matchWinner = matchWinner;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultMargin() {
		return resultMargin;
	}
	public void setResultMargin(String resultMargin) {
		this.resultMargin = resultMargin;
	}
	public String getUmpire1() {
		return umpire1;
	}
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	public String getUmpire2() {
		return umpire2;
	}
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}
}
