package tj.politech.diplom.data_repository.multiple_answer_test

import retrofit2.http.Query
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.domain.multiple_test.entiry.MultipleAnswerEntity
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

interface MultipleAnswerTestApi : Api {
    fun getMultipleAnswerTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<MultipleAnswerEntity>
}