package tj.politech.diplom.data_repository.comporison_test

import retrofit2.http.Query
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.domain.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList

interface ComparisonTestApi : Api {
    fun getComparisonTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<ComparisonTestEntity>
}