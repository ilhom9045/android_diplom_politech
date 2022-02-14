package tj.politech.diplom.repository.simple_test

import retrofit2.http.Query
import tj.politech.diplom.repository.network.api.BaseApi
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.simple_test.entity.SimpleTestEntity

interface SimpleTestApi : BaseApi {

    fun getSimpleTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<SimpleTestEntity>
}