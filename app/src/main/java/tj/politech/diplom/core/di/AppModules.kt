package tj.politech.diplom.core.di

import org.koin.dsl.module
import tj.politech.diplom.data_repository.network.NetworkRepository
import tj.politech.diplom.data_repository.network.NetworkRepositoryImpl
import tj.politech.diplom.data_repository.comporison_test.ComparisonTestApi
import tj.politech.diplom.data_repository.comporison_test.ComparisonTestRepositoryImpl
import tj.politech.diplom.data_repository.multiple_answer_test.MultipleAnswerTestApi
import tj.politech.diplom.data_repository.multiple_answer_test.MultipleAnswerTestRepositoryImpl
import tj.politech.diplom.data_repository.native.NativeRepository
import tj.politech.diplom.data_repository.native.NativeRepositoryImpl
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.data_repository.open_test.OpenTestApi
import tj.politech.diplom.data_repository.open_test.OpenTestRepositoryImpl
import tj.politech.diplom.data_repository.simple_test.SimpleTestApi
import tj.politech.diplom.data_repository.simple_test.SimpleTestRepositoryImpl
import tj.politech.diplom.data_repository.test_list.TestListApi
import tj.politech.diplom.data_repository.test_list.TestListRepositoryImpl
import tj.politech.diplom.domain.comporison_test.repository.ComparisonTestRepository
import tj.politech.diplom.domain.comporison_test.usecase.ComparisonTestUseCase
import tj.politech.diplom.domain.multiple_test.repository.MultipleAnswerTestRepository
import tj.politech.diplom.domain.multiple_test.usecase.MultipleAnswerTestUseCase
import tj.politech.diplom.domain.open_test.repository.OpenTestRepository
import tj.politech.diplom.domain.open_test.usecase.OpenTestUseCase
import tj.politech.diplom.domain.simple_test.repository.SimpleTestRepository
import tj.politech.diplom.domain.simple_test.usecase.SimpleTestUseCase
import tj.politech.diplom.domain.test_list.repository.TestListRepository
import tj.politech.diplom.domain.test_list.usecase.SearchTestBySubjectUseCase
import tj.politech.diplom.domain.test_list.usecase.TestListsUseCase

object AppModules {

    private val nativeModule = module {
        factory<NativeRepository> { NativeRepositoryImpl() }
    }

    private val networkModule = module {
        factory<NetworkRepository> { NetworkRepositoryImpl(get(), get()) }
        single<Api> { get<NetworkRepository>().createService(Api::class.java) }
    }

    private val simpleTestModule = module {
        factory { get<NetworkRepository>().createService(SimpleTestApi::class.java) }
        factory<SimpleTestRepository> { SimpleTestRepositoryImpl(get()) }
        single { SimpleTestUseCase(get()) }
    }

    private val multipleAnswerTestModule = module {
        factory { get<NetworkRepository>().createService(MultipleAnswerTestApi::class.java) }
        factory<MultipleAnswerTestRepository> { MultipleAnswerTestRepositoryImpl(get()) }
        single { MultipleAnswerTestUseCase(get()) }
    }

    private val openTestModule = module {
        factory { get<NetworkRepository>().createService(OpenTestApi::class.java) }
        factory<OpenTestRepository> { OpenTestRepositoryImpl(get()) }
        single { OpenTestUseCase(get()) }
    }

    private val comparisonTestModule = module {
        factory { get<NetworkRepository>().createService(ComparisonTestApi::class.java) }
        factory<ComparisonTestRepository> { ComparisonTestRepositoryImpl(get()) }
        single { ComparisonTestUseCase(get()) }
    }

    private val testListModule = module {
        factory { get<NetworkRepository>().createService(TestListApi::class.java) }
        factory<TestListRepository> { TestListRepositoryImpl(get()) }
        single { TestListsUseCase(get()) }
        single { SearchTestBySubjectUseCase(get()) }
    }

    val modules = listOf(
        nativeModule,
        networkModule,
        simpleTestModule,
        multipleAnswerTestModule,
        openTestModule,
        comparisonTestModule,
        testListModule
    )
}