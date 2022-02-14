package tj.politech.diplom.comporison_test.usecase

import tj.politech.diplom.comporison_test.entity.ComparisonTestEntity
import tj.politech.diplom.comporison_test.repository.ComparisonTestRepository
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList

class ComparisonTestUseCase(private val comparisonTestRepository: ComparisonTestRepository) {
    fun execute(subjectId: Int, testCount: Int): GenericResponseArrayList<ComparisonTestEntity> {
        return comparisonTestRepository.getComparisonTests(
            subjectId = subjectId,
            testCount = testCount
        )
    }
}