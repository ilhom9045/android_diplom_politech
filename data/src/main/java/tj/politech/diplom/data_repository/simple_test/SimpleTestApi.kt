package tj.politech.diplom.data_repository.simple_test

import retrofit2.http.Query
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.simple_test.entity.SimpleTestEntity

interface SimpleTestApi : Api {

    fun getSimpleTest(
        @Query("subjectId") subjectId: Int,
        @Query("testCount") testCount: Int
    ): GenericResponseArrayList<SimpleTestEntity>
}