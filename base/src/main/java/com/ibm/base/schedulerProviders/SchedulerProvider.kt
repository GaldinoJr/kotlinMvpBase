package com.ibm.base.schedulerProviders

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun io(): Scheduler
    fun ui(): Scheduler
}