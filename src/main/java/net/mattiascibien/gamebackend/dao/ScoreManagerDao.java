package net.mattiascibien.gamebackend.dao;

import net.mattiascibien.gamebackend.model.Score;

import java.util.List;

public interface ScoreManagerDao {
    Score fetchScoreById(int scoreId);
    List featchAllScores();
    void insertScore(Score score);
    void deleteScore(int scoreId);
}
