package tj.politech.diplom.data_repository.test_list

import retrofit2.http.Query
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.test_list.entity.TestListEntity

interface TestListApi : Api {

    fun searchBySubject(@Query("subject_name") subjectName: String): GenericResponseArrayList<TestListEntity>

    fun getTestByRace(
        @Query("start") start: Int,
        @Query("end") end: Int
    ): GenericResponseArrayList<TestListEntity>
}