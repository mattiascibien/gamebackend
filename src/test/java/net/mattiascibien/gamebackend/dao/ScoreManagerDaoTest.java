package net.mattiascibien.gamebackend.dao;

import net.mattiascibien.gamebackend.dao.impl.ScoreManagerInMemoryDao;
import net.mattiascibien.gamebackend.model.Score;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreManagerDaoTest {


    private ScoreManagerDao dao;
    private int count;

    @Before
    public void setUp()
    {
        dao = new ScoreManagerInMemoryDao();
        dao.insertScore(new Score(0, "hello", 100));
        count = dao.featchAllScores().size();
    }

    @Test
    public void fetchScoreById() throws Exception {
        Score score = dao.fetchScoreById(0);
        Assert.assertEquals(0, score.getId());
        Assert.assertEquals("hello", score.getName());
    }

    @Test
    public void featchAllScores() throws Exception {
        int count = dao.featchAllScores().size();
        Assert.assertTrue(count > 0);
    }

    @Test
    public void insertScore() throws Exception {
        dao.insertScore(new Score(0, "hello", 69));
        Assert.assertEquals(count+1, dao.featchAllScores().size());
    }

    @Test
    public void deleteScore() throws Exception {
        dao.deleteScore(0);
        Assert.assertEquals(count-1, dao.featchAllScores().size());
    }

}