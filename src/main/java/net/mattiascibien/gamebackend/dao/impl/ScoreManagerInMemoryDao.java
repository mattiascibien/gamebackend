package net.mattiascibien.gamebackend.dao.impl;

import net.mattiascibien.gamebackend.dao.ScoreManagerDao;
import net.mattiascibien.gamebackend.model.Score;

import java.util.ArrayList;
import java.util.List;

public class ScoreManagerInMemoryDao implements ScoreManagerDao {
    private int nextScoreId = 0;

    private List<Score> scores = new ArrayList<>();

    @Override
    public Score fetchScoreById(int scoreId) {
        for (Score score : scores)
        {
            if (score.getId() == scoreId)
            {
                return score;
            }
        }

        throw new RuntimeException("Score Not Found: " + scoreId);
    }

    @Override
    public List featchAllScores() {
        return scores;
    }

    @Override
    public void insertScore(Score score) {
        score.setId(nextScoreId++);
        scores.add(score);
    }

    @Override
    public void deleteScore(int scoreId) {
        Score score = fetchScoreById(scoreId);
        scores.remove(score);
    }
}
