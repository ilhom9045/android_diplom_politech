package tj.politech.diplom.test_list.usecase

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.test_list.entity.TestListEntity
import tj.politech.diplom.test_list.repository.TestListRepository

class TestListsUseCase(private val testListRepository: TestListRepository) {
    fun execute(start: Int, end: Int): GenericResponseArrayList<TestListEntity> {
        return testListRepository.getTestListByRace(start, end)
    }
}