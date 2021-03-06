package kr.webgori.lolien.discord.bot.entity;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "summoner")
@ToString(exclude = {"leagues", "participants"})
@EqualsAndHashCode(exclude = {"participants"})
public class LoLienSummoner {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idx;

  private String id;

  @Column(name = "account_id")
  private String accountId;

  @Column(name = "summoner_level")
  private Integer summonerLevel;

  @Column(name = "summoner_name")
  private String summonerName;

  @OneToMany(mappedBy = "loLienSummoner", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<League> leagues;

  @OneToMany(mappedBy = "loLienSummoner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LoLienParticipant> participants;

  @Column
  private Integer mmr;

  public void plusMmr(Integer mmr) {
    this.mmr += mmr;
  }

  public void minusMmr(Integer mmr) {
    this.mmr -= mmr;
  }
}
