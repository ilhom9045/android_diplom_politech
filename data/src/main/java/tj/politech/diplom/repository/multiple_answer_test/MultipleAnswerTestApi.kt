package tj.politech.diplom.repository.multiple_answer_test

import retrofit2.http.Query
import tj.politech.diplom.repository.network.api.BaseApi
import tj.politech.diplom.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

interface MultipleAnswerTestApi : BaseApi {
    fun getMultipleAnswerTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<MultipleAnswerEntity>
}