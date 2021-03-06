package kr.webgori.lolien.discord.bot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "participant_stats")
@ToString(exclude = {"participant"})
@EqualsAndHashCode(exclude = {"participant"})
public class LoLienParticipantStats {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idx;

  @OneToOne
  private LoLienParticipant participant;

  @Column(name = "altars_captured")
  private Integer altarsCaptured;
  @Column(name = "altars_neutralized")
  private Integer altarsNeutralized;
  private Integer assists;
  @Column(name = "champ_level")
  private Integer champLevel;
  @Column(name = "combat_player_score")
  private Integer combatPlayerScore;
  @Column(name = "damage_dealt_to_objectives")
  private Long damageDealtToObjectives;
  @Column(name = "damage_dealt_to_turrets")
  private Long damageDealtToTurrets;
  @Column(name = "damage_self_mitigated")
  private Long damageSelfMitigated;
  private Integer deaths;
  @Column(name = "double_kills")
  private Integer doubleKills;
  @Column(name = "first_blood_assist")
  private Boolean firstBloodAssist;
  @Column(name = "first_blood_kill")
  private Boolean firstBloodKill;
  @Column(name = "first_inhibitor_assist")
  private Boolean firstInhibitorAssist;
  @Column(name = "first_inhibitor_kill")
  private Boolean firstInhibitorKill;
  @Column(name = "first_tower_assist")
  private Boolean firstTowerAssist;
  @Column(name = "first_tower_kill")
  private Boolean firstTowerKill;
  @Column(name = "gold_earned")
  private Integer goldEarned;
  @Column(name = "gold_spent")
  private Integer goldSpent;
  @Column(name = "inhibitor_kills")
  private Integer inhibitorKills;
  private Integer item0;
  private Integer item1;
  private Integer item2;
  private Integer item3;
  private Integer item4;
  private Integer item5;
  private Integer item6;
  @Column(name = "killing_sprees")
  private Integer killingSprees;
  private Integer kills;
  @Column(name = "largest_critical_strike")
  private Integer largestCriticalStrike;
  @Column(name = "largest_killing_spree")
  private Integer largestKillingSpree;
  @Column(name = "largest_multi_kill")
  private Integer largestMultiKill;
  @Column(name = "longest_time_spent_living")
  private Integer longestTimeSpentLiving;
  @Column(name = "magic_damage_dealt")
  private Long magicDamageDealt;
  @Column(name = "magic_damage_dealt_to_champions")
  private Long magicDamageDealtToChampions;
  @Column(name = "magical_damage_taken")
  private Long magicalDamageTaken;
  @Column(name = "neutral_minions_killed")
  private Integer neutralMinionsKilled;
  @Column(name = "neutral_minions_killed_enemy_jungle")
  private Integer neutralMinionsKilledEnemyJungle;
  @Column(name = "neutral_minions_killed_team_jungle")
  private Integer neutralMinionsKilledTeamJungle;
  @Column(name = "node_capture")
  private Integer nodeCapture;
  @Column(name = "node_capture_assist")
  private Integer nodeCaptureAssist;
  @Column(name = "node_neutralize")
  private Integer nodeNeutralize;
  @Column(name = "node_neutralize_assist")
  private Integer nodeNeutralizeAssist;
  @Column(name = "objective_player_score")
  private Integer objectivePlayerScore;
  @Column(name = "participant_id")
  private Integer participantId;
  @Column(name = "penta_kills")
  private Integer pentaKills;
  @Column(name = "physical_damage_dealt")
  private Long physicalDamageDealt;
  @Column(name = "physical_damage_dealt_to_champions")
  private Long physicalDamageDealtToChampions;
  @Column(name = "physical_damage_taken")
  private Long physicalDamageTaken;
  @Column(name = "quadra_kills")
  private Integer quadraKills;
  @Column(name = "sight_wards_bought_in_game")
  private Integer sightWardsBoughtInGame;
  @Column(name = "team_objective")
  private Integer teamObjective;
  @Column(name = "time_ccing_others")
  private Integer timeCCingOthers;
  @Column(name = "total_damage_dealt")
  private Long totalDamageDealt;
  @Column(name = "total_damage_dealt_to_champions")
  private Long totalDamageDealtToChampions;
  @Column(name = "total_damage_taken")
  private Long totalDamageTaken;
  @Column(name = "total_heal")
  private Long totalHeal;
  @Column(name = "total_minions_killed")
  private Integer totalMinionsKilled;
  @Column(name = "total_player_score")
  private Integer totalPlayerScore;
  @Column(name = "total_score_rank")
  private Integer totalScoreRank;
  @Column(name = "total_time_crowd_control_dealt")
  private Integer totalTimeCrowdControlDealt;
  @Column(name = "total_units_healed")
  private Integer totalUnitsHealed;
  @Column(name = "triple_kills")
  private Integer tripleKills;
  @Column(name = "true_damage_dealt")
  private Long trueDamageDealt;
  @Column(name = "true_damage_dealt_to_champions")
  private Long trueDamageDealtToChampions;
  @Column(name = "true_damage_taken")
  private Long trueDamageTaken;
  @Column(name = "turret_kills")
  private Integer turretKills;
  @Column(name = "unreal_kills")
  private Integer unrealKills;
  @Column(name = "vision_score")
  private Long visionScore;
  @Column(name = "vision_wards_bought_in_game")
  private Integer visionWardsBoughtInGame;
  @Column(name = "wards_killed")
  private Integer wardsKilled;
  @Column(name = "wards_placed")
  private Integer wardsPlaced;

  private Boolean win;
  private Integer perk0;
  private Integer perk1;
  private Integer perk2;
  private Integer perk3;
  private Integer perk4;
  private Integer perk5;
  @Column(name = "perk0_var1")
  private Long perk0Var1;
  @Column(name = "perk0_var2")
  private Long perk0Var2;
  @Column(name = "perk0_var3")
  private Long perk0Var3;
  @Column(name = "perk1_var1")
  private Long perk1Var1;
  @Column(name = "perk1_var2")
  private Long perk1Var2;
  @Column(name = "perk1_var3")
  private Long perk1Var3;
  @Column(name = "perk2_var1")
  private Long perk2Var1;
  @Column(name = "perk2_var2")
  private Long perk2Var2;
  @Column(name = "perk2_var3")
  private Long perk2Var3;
  @Column(name = "perk3_var1")
  private Long perk3Var1;
  @Column(name = "perk3_var2")
  private Long perk3Var2;
  @Column(name = "perk3_var3")
  private Long perk3Var3;
  @Column(name = "perk4_var1")
  private Long perk4Var1;
  @Column(name = "perk4_var2")
  private Long perk4Var2;
  @Column(name = "perk4_var3")
  private Long perk4Var3;
  @Column(name = "perk5_var1")
  private Long perk5Var1;
  @Column(name = "perk5_var2")
  private Long perk5Var2;
  @Column(name = "perk5_var3")
  private Long perk5Var3;
  @Column(name = "player_score0")
  private Long playerScore0;
  @Column(name = "player_score1")
  private Long playerScore1;
  @Column(name = "player_score2")
  private Long playerScore2;
  @Column(name = "player_score3")
  private Long playerScore3;
  @Column(name = "player_score4")
  private Long playerScore4;
  @Column(name = "player_score5")
  private Long playerScore5;
  @Column(name = "player_score6")
  private Long playerScore6;
  @Column(name = "player_score7")
  private Long playerScore7;
  @Column(name = "player_score8")
  private Long playerScore8;
  @Column(name = "player_score9")
  private Long playerScore9;
  @Column(name = "perk_primary_style")
  private Integer perkPrimaryStyle;
  @Column(name = "perk_sub_style")
  private Integer perkSubStyle;
  @Column(name = "stat_perk0")
  private Integer statPerk0;
  @Column(name = "stat_perk1")
  private Integer statPerk1;
  @Column(name = "stat_perk2")
  private Integer statPerk2;
}