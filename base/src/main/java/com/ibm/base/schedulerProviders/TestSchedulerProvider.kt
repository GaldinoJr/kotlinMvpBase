package com.ibm.base.schedulerProviders

import io.reactivex.Scheduler
import io.reactivex.schedulers.TestScheduler

class TestSchedulerProvider(private val scheduler: TestScheduler): SchedulerProvider {

    override fun io(): Scheduler {
        return scheduler
    }

    override fun ui(): Scheduler {
        return scheduler
    }
}