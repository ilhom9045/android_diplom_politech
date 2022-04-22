package tj.politech.diplom.domain.test_list.usecase

import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.test_list.entity.TestListEntity
import tj.politech.diplom.domain.test_list.repository.TestListRepository

class TestListsUseCase(private val testListRepository: TestListRepository) {
    fun execute(start: Int, end: Int): GenericResponseArrayList<TestListEntity> {
        return testListRepository.getTestListByRace(start, end)
    }
}