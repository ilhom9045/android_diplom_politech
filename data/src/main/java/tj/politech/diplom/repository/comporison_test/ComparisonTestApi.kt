package tj.politech.diplom.repository.comporison_test

import retrofit2.http.Query
import tj.politech.diplom.repository.network.api.BaseApi
import tj.politech.diplom.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

interface ComparisonTestApi : BaseApi {
    fun getComparisonTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<ComparisonTestEntity>
}