package tj.politech.diplom.data_repository.test_list

import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.test_list.entity.TestListEntity
import tj.politech.diplom.domain.test_list.repository.SearchTestBySubjectRepository
import tj.politech.diplom.domain.test_list.repository.TestListRepository

class TestListRepositoryImpl(private val testListApi: TestListApi) : TestListRepository,
    SearchTestBySubjectRepository
{
    override fun getTestListByRace(start: Int, end: Int): GenericResponseArrayList<TestListEntity> {
        return testListApi.getTestByRace(start, end)
    }

    override fun searchBySubject(subjectName: String): GenericResponseArrayList<TestListEntity> {
        return testListApi.searchBySubject(subjectName)
    }

}