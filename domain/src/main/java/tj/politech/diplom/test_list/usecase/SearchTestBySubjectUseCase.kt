package tj.politech.diplom.test_list.usecase

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.test_list.entity.TestListEntity
import tj.politech.diplom.test_list.repository.SearchTestBySubjectRepository

class SearchTestBySubjectUseCase(private val testList: SearchTestBySubjectRepository) {
    fun execute(query: String): GenericResponseArrayList<TestListEntity> {
        return testList.searchBySubject(query)
    }
}