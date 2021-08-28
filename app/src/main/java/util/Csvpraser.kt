package util

import android.provider.SyncStateContract
import com.example.olympic_tokyo.Games

class Csvpraser {
    fun parse(line:String): Games{
        val tokens=line.split( ",")
        return Games(grade=tokens[constant.ColumnIndex.GRADE].toInt(),
        teams = tokens[constant.ColumnIndex.TEAMS],
                goldMedal =tokens [constant.ColumnIndex.GOLD_MEDAL],
                silverMedal =tokens[constant.ColumnIndex.SILVER_MEDAL],
                bronzeMedal =tokens[constant.ColumnIndex.BRONZE_MEDAL],
                totalMedalsOfTeam =tokens[constant.ColumnIndex.TOTAL_MEDALS_OF_TEAM].toInt(),
                gradeUsingTotal =tokens[constant.ColumnIndex.GRADE_USING_TOTAL].toInt(),
                NOCCode =tokens[constant.ColumnIndex.NOC_CODE]
        )
    }
}